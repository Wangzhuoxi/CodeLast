package jianzhioffer;
//由于 StringBuilder 相较于 StringBuffer 有速度优势
//，所以多数情况下建议使用 StringBuilder 类。
//和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，
//        并且不产生新的未使用对象。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
public class Code02ReplaceEmpty {
    public String replaceSpace(StringBuffer str) {
StringBuilder sb=new StringBuilder();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)==' ')
sb.append("%20");
else
sb.append(str.charAt(i));
}
return sb.toString();
    }
}
