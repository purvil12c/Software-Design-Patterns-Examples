package strategy;

/*
  Represents an instance to perform zip/unzip operations.
 */
public class ZiperUnziper {

  private IZipStrategy zipStrategy;
  private IUnzipStrategy unzipStrategy;

  public ZiperUnziper(IZipStrategy zipStrategy, IUnzipStrategy unzipStrategy){
    this.zipStrategy = zipStrategy;
    this.unzipStrategy = unzipStrategy;
  }

  public void zip(){
    this.zipStrategy.zip();
  }

  public void unzip(){
    this.unzipStrategy.unzip();;
  }
}
