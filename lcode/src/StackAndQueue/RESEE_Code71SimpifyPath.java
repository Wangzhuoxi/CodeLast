package StackAndQueue;


import java.util.Stack;

public class RESEE_Code71SimpifyPath {
        public String simplifyPath(String path) {
            //基本思想就是遇到..就弹出栈遇到字母就放入栈
            String[] pa = path.split("/");
            Stack s = new Stack();
            StringBuffer res = new StringBuffer();
            for (int i = 0; i < pa.length; i++) {
                //如果为“”或者.或者..栈是空都直接进行下一个循环（“”可能是根据/切割产生）
                if (pa[i].equals("") || pa[i].equals(".") || (pa[i].equals("..") && s.isEmpty())) {
                    continue;
                } else if (pa[i].equals("..") && !s.isEmpty()) {
                    //返回上一级并且上一级有直接弹出一个字母
                    s.pop();
                } else {
                    //如果以上条件不成立就是字母压入到栈中
                    s.push(pa[i]);
                }
            }
            if (s.isEmpty()) {
                return "/";
            } else {
                Object[] a = s.toArray();
                for (int i = 0; i < a.length; i++) {
                    res.append("/" + a[i].toString());
                }
                return res.toString();
            }

        }

    }
