package cadastroProdutos;

public class Product {
    public String name;
    public double price;
    public int quantity;

    //Multiplica a quantidade pelo valor
    public double totalValueInStock(){
        return price * quantity;
    }
    //Adiciona nova quantidade
    public void addProducts(int quantity){
         this.quantity += quantity;
    }
    //Remove do estoque
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    //formata o modo da impressao
    public String toString() {
        return 
            name + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f",totalValueInStock());
    }
}
