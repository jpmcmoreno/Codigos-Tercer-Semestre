
package compresionmenu;


public class Zip implements CompressionAlgorithm {

    @Override
    public void compress(String filename) {
        System.out.println("creating "+filename+".zip");
    }
    
}
