import java.nio.file.attribute.UserPrincipalLookupService;

public class Singleton {
    private static Singleton DataBaseConnectionInstance;

    private Singleton(){
        System.out.println("Database Up!");
    }

    public static synchronized Singleton getInstance() {
        if(DataBaseConnectionInstance == null){
            System.out.println("Estabelecendo nova conexão com o banco de dados...");
            DataBaseConnectionInstance = new Singleton();
        }
        else {
            System.out.println("Retornando instancia já existente");
        }

        return DataBaseConnectionInstance;
    }

    public synchronized void closeInstance(){
        if(DataBaseConnectionInstance != null){
            DataBaseConnectionInstance = null;
            System.out.println("Instancia do Banco de dados encerrada");
        }
        else {
            System.out.println("Não há nehuma instancia aberta");
        }
    }
}
