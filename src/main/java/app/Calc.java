package app;

public class Calc {

//المعاملات الحسابية إضافة واحد  ++
public static void main(String[] args){

//    int x = 1;
//    x++;
//    System.out.print(++x);
//

//درس عوامل المقارنات
    int x = 10;
    int y = 20;
    boolean z = true;
    boolean w = false;
    System.out.println(x==y);
    // إذا كان 2 يساوي معناه انه يسألأ هل الاكس يساوي واي

    System.out.println(x!=y);
    //هل الأكس لايساوي الواي

    System.out.println(x>y);
//هل الاكس اكبر من واي


    System.out.println(x<y);

    System.out.println(x>=y);
//أكبر أو يساوي
    System.out.println(x<=y);


    System.out.println(z&&w);
    //تستخدم للمقارنات بين شيئين

    System.out.println(z||w);
    //ت

    System.out.println(!(z&&w));
    //علامة التعجب تعكس النتيجة دائما

    //الواجب عوامل التعريفات
    int A = 10;
    int C = 20;

    System.out.println(C+=A);
    System.out.println(C-=A);
    System.out.println(C*=A);
    System.out.println(C/=A);
    System.out.println(C%=A);





}
}
