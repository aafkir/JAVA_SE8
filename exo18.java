package ma.to.dart;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class exo18 {

    private  String title;
    private  String prefixTitle(String prefix){
        StringBuilder builder = new StringBuilder();
        builder.append(prefix).append(this.title);
        return builder.toString();
    }
    public static void main(String args[]){
        System.out.println("-----");

    }
}
/*
public class Book{
    public static void main(String[] args) {
        exo18 article = new exo18();
        Method[] methods = article.getClass().getMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }
    }
}

 */