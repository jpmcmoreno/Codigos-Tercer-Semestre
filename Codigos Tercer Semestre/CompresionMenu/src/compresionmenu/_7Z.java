
package compresionmenu;


public class _7Z implements CompressionAlgorithm {

    @Override
    public void compress(String filename) {
         System.out.println("creating "+filename+".7z");
    }
    
}
