package strategy;

public class StrategyExampleMain {

  public static void main(String args[]){
    // Creating a new ZiperUnziper instance which uses metal head algorithms to zip/unzip.
    ZiperUnziper metalHeadZiperUnziper = new ZiperUnziper(new MetalHeadZip(), new MetalHeadUnzip());
    metalHeadZiperUnziper.zip();
    metalHeadZiperUnziper.unzip();

    // Creating a new ZiperUnziper instance which uses beta algorithms to zip/unzip.
    ZiperUnziper betaZiperUnziper = new ZiperUnziper(new BetaZip(), new BetaUnzip());
    betaZiperUnziper.zip();
    betaZiperUnziper.unzip();

    // Creating a new ZiperUnziper instance which is a hybrid between metal head and beta.
    ZiperUnziper hybridZiperUnziper = new ZiperUnziper(new MetalHeadZip(), new BetaUnzip());
    hybridZiperUnziper.zip();
    hybridZiperUnziper.unzip();
  }
}
