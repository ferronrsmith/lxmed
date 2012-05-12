package net.sourceforge.lxmed.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import net.sourceforge.lxmed.LxmedException;
import net.sourceforge.lxmed.model.MenuItem;

/**
 * Class that provides operations for saving and deleting menu items.
 *
 * @author <a href="mailto:cicakmarko@yahoo.com">Marko Čičak</a>
 */
public class FileUtil {

    /**
     * Saves given menu item.
     *
     * @param item menu item to save
     * @return true if successfully saved, otherwise false
     * @throws FileNotFoundException if file was not found.
     */
    public static boolean save(MenuItem item) throws FileNotFoundException {
        File path = item.getPath();

        if (!path.getParentFile().exists()) {
            if (!path.getParentFile().mkdirs()) {
                System.out.println(path.getParent());
                throw new LxmedException("Directory not created.");
            }
        }

        try {
            PrintWriter pout = new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));

            pout.print(item.getDesktopCode());

            pout.flush();
            pout.close();
        } catch (UnsupportedEncodingException ex) {
            System.out.println("OVDE SAAAAM");
            return false;
        }

        return true;
    }

    /**
     * Deletes a file which represents a menu item.
     * @param item item to be deleted
     * @return true if file is successfully deleted, otherwise false
     */
    public static boolean delete(MenuItem item) {
        return item.getPath().delete();
    }
}