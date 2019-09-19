
package Trabalho;

public class Logic {
    public int[][] movimentar(int num, int lin, int col, int lab[][]){
        lab[lin][col] = 0;
        if(num == 0){
            lin--;
        }
        else if(num == 1){
            lin++;
        }
        else if(num == 2){
            col--;
        }
        else if(num == 3){
            col++;
        }
        lab[lin][col] = 3;
        return lab;
    }
    public int procurarLin(int lab[][]){
        int lin = 0;
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[0].length; j++) {
                if(lab[i][j] == 3)
                        lin = i;
            }
        }
        return lin;
    }
    public int procurarCol(int lab[][]){
        int col = 0;
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[0].length; j++) {
                if(lab[i][j] == 3)
                        col = j;
            }
        }
        return col;
    }
    public String gerarMatS(int[][] lab){
        String ret= "";
        int[][] lab = gerarMat();
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[0].length; j++) {
                ret += " "+lab[i][j];
            }
            ret += "\n";
        }
        return ret;
    }
    public int[][] gerarMat(){       
        int[][] lab = new int[13][27];
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[0].length; j++) {
                lab[i][j] = 0;
            }
        }
        lab[0][0] = 3;
        return lab;
    }
}
