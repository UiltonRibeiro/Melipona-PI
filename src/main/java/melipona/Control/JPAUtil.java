        package melipona.Control;
        
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Classe responsável pela abertura e fechamento da interação com BDD
 * @author Uilton
 * @version 1.0
 * @since Primeira versão
 */
public class JPAUtil {
    
    /** Importante: Constante responsável por conexão do banco de dados*/
    private static final String PERSISTENCE_UNIT = "melipona";
    
    private static EntityManager em;
    private static EntityManagerFactory fabrica;
    
    //private static usuario user;
    
    
    /**Abre a interação*/
    public static EntityManager getEntityManager(){
        if(fabrica == null || !fabrica.isOpen())
           fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        if(em == null || !em.isOpen())
            em = fabrica.createEntityManager();
        
        return em;
    }
    
    /**fecha a interação*/
    public static void closeEntityManager(){
        if(em.isOpen() && em != null)
            em.close();
            fabrica.close();
    }
    /**Critografa as senha c/ MD5*/
    public static String criptografia(String senha){
        String senhaCript = null;
        try {
            MessageDigest MD = MessageDigest.getInstance("MD5");
            byte[] MenssageDisgest = MD.digest(senha.getBytes());
            BigInteger bi = new BigInteger(1,MenssageDisgest);
            
            String hashText = bi.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            senhaCript = hashText;
        } catch (Exception e) {
        }
         return senhaCript;
    }
}

 /*
    public static void usuarioValido(usuario userAuth){
        user = userAuth;
    }
    
    public static usuario setUsuario(){
        return user;
    }
    */
