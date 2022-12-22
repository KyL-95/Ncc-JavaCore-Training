package dependencyInject;

public interface IUse {
     void kill();

     default void nothing(){
          System.out.println("Không sử dụng");
     };

//    void play();
}
