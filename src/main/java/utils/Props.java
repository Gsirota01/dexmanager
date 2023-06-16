package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Props {
    static Properties properties = new Properties();
    static FileInputStream fileInputStream = null;
    public static String getPropertie(String filename, String key){
        try {
            // Carga el archivo de propiedades
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/conf/"+filename+".properties");
            properties.load(fileInputStream);

            // Obtiene los valores de los atributos
            String value = properties.getProperty(key);

            if(value.equals(null)) throw new Exception();
            return value;
        } catch (Exception e) {
            System.out.println("Error - No se ha podido obtener la variable: "+ key);
        }
        return null;
    }
}
