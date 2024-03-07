public class BingoTester {
  public static void main(String[] args) {

  Bingo object = new Bingo();
  Bingo.fillCard();
  Bingo.printCard();
  Bingo.playGame();
  Bingo.printCalledNumbers(Bingo.collectedCalledNumbers);
  Bingo.printBingoX(Bingo.bingoCard);


        }
}
