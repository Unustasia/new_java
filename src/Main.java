
public class Main{

    int puppyAge;

    public Main(String name){
        // Это конструктор и у него один параметр, name.
        // Это самое тупое, зачем... если есть метод, зачем делать какой-то
        // конструктор
        System.out.println("Имя:" + name );
    }
    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("Возраст щенка:" + puppyAge );
        return puppyAge;
    }
    public static void main(String []args){
        /* Создание объекта. */
        Main myPuppy = new Main( "Рыжик" );

        /* Вызов метод класса, чтобы установить возраст щенка. */
        myPuppy.setAge( 2 );

        /* Вызов другого метода класса, чтобы получить возраст щенка. */
        myPuppy.getAge( );

        /* Получение переменной экземпляра класса. */
        System.out.println("Значение переменной:" + myPuppy.puppyAge );
    }
}