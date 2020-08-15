package jianzhioffer;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Code35isNumeric {
    /**
     * e,.,+-,
     * @param str
     * @return
     */
   public boolean isNumeric(char[] str) {
       // 标记符号、小数点、e是否出现过
       boolean sign = false;
       boolean decimal = false;
       boolean hasE = false;
       for(int i=0;i<str.length;i++) {
           if (str[i] == 'e' || str[i] == 'E') {
               //出现过e,错误
               if (hasE)
                   return false;
               //e后面没了，错误
               if (i + 1 == str.length)
                   return false;
               hasE = true;
           } else if (str[i] == '+' || str[i] == '-') {
               //这是第二次出现+-号，则必须跟在e后。
               if (sign) {
                   if (str[i - 1] != 'e' && str[i - 1] != 'E')
                       return false;
               } else//第一次出现
               {
                   //如果不在首位，也要再e后面
                   if (i > 0 && str[i - 1] != 'e' && str[i - 1] != 'E')
                       return false;
                   else
                       sign = true;
               }
           } else if (str[i] == '.') {
               //.只能出现一次。并且e之后不行。
               if (hasE || decimal)
                   return false;
               decimal = true;
           } else if (str[i] < '0' || str[i] > '9') // 不合法字符
               return false;
       }
       return true;

       }

    }


