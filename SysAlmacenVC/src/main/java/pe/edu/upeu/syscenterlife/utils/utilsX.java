package pe.edu.upeu.syscenterlife.utils;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class utilsX {

    public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }

    public File getFileExterno(String carpeta, String filex) {
        File newFolder = new File(carpeta);
        String ruta = newFolder.getAbsolutePath();
        Path CAMINO = Paths.get(ruta + "/" + filex);
        return CAMINO.toFile();
    }

    public File getFolderExterno(String carpeta) {
        File newFolder = new File(carpeta);
        String ruta = newFolder.getAbsolutePath();
        Path CAMINO = Paths.get(ruta + "/");
        return CAMINO.toFile();
    }
}
