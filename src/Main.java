import java.util.Date;

public class Main {
    private static Date date;

    /*
    代码格式化:ctrl +alt + L
    代码缩进：ctrl +alt + i
    查看最近修改的代码：ctrl+shift+backspace
    代码外包装代码：ctrl +alt +t
    方法之间相互移动：alt + 下/下箭头
    定位到错误代码处：F2
    删除整行代码：ctrl + d
    剪切整行代码：ctrl + x
    在当前文件中查找文本：ctrl + f
    在当前文件中替换文本：ctrl + r
    查找类：ctrl + n
    查找文件：ctrl +shift + n
    注释：
                   单行：ctrl + /
                   多行：ctrl + shift + /
    自动补全变量名称 : Ctrl + Alt + v
      Data data = data;
    自动补全属性名称 : Ctrl + Alt + f
     private static Data data;

    提示导航：alt + enter
    */

    public static void main1(String[] args) {
        if (true) {
            System.out.println("Hello World!!!");
            System.out.println("Hello!Tony!");
        }
    }

    public static void main2(String[] args) {
        if (true) {
            System.out.println("Hello World!!!");
        }
    }

    public static void main3(String[] args) {
        if (true) {
            System.out.println("Hello World!!!");
            System.out.println();
            date = new Date();
        }
    }
}
