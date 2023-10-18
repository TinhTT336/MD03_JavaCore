package ra.lession.advance.run;

import ra.lession.advance.bussinessImp.Catalog;
import ra.lession.advance.config.Config;

import java.util.List;

public class CatalogManagement {
    public static void addCatalog(List<Catalog> catalogList){
        System.out.println("Nhap so luong danh muc muon them moi");
        int number= Config.getValidateInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Nhap danh muc thu "+(i+1));
            Catalog cat1=new Catalog();
            cat1.inputData();
            catalogList.add(cat1);
        }

        for(Catalog cat:catalogList){
            cat.displayData();
        }
    }

}
