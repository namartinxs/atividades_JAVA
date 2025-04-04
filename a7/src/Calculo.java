public class Calculo {
    //mtdo construtor 
    public Calculo(){

    }
    // funcao p/ calcular vaorews recebendo como params (doubles) um valor e a operação do tipo string
    public double CalcularValores(double param, double param1,String operacao)
    {
        double resultado = 0;
        if (operacao == "+")
            resultado = param + param1;

        else  if (operacao == "-")
             resultado = param - param1;

        else  if (operacao == "*")
             resultado = param * param1;

        else 
             resultado = param / param1;

    
        return resultado;
    }

    //procedure
    public void CalcBhask(double valorA, double valorB, double valorC){
        double vlrCalc= Math.pow(valorC, valorB) - (4 * valorA * valorC);
        double delta = Math.sqrt(vlrCalc);

        double x1 = ((valorB * -1) + delta)/ (valorA * 2);
        double x2 = ((valorB * -1) - delta)/ (valorA * 2);

        System.out.println("x': "+x1 + "x'': " + x2);


    }
}
