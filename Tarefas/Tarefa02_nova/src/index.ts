import Cliente from "./cliente";
import Endereco from "./endereco";
import Telefone from "./telefone";
import Produto from "./produto";
import Venda from "./venda";

const endereco = new Endereco("Rua Orquidea", 123, "Guarapuava", "PR");

const telefone1 = new Telefone("42", 999999999, "Celular");
const telefone2 = new Telefone("42", 988888888, "Fixo");

const cliente = new Cliente("João Luy", 12345678910, 26012005, "Masculino");

cliente["_endereco"] = endereco;
cliente["_telefones"] = [telefone1, telefone2];

const produto1 = new Produto(1, "Notebook", 3500);
const produto2 = new Produto(2, "Mouse Gamer", 250);
const produto3 = new Produto(3, "Teclado Mecânico", 400);

const venda = new Venda(101, 20240304, cliente, [produto1, produto2, produto3]);

console.log("Detalhes da Venda:");
console.log("Código da Venda:", venda.codigo);
console.log("Data da Venda:", venda.data);
console.log("Cliente:", venda.cliente.nome);
console.log("Produtos Comprados:");
venda.produtos.forEach((produto, index) => {
    console.log(`${index + 1}. ${produto.descricao} - R$${produto.valor}`);
});

console.log("Total da Venda: R$", venda.calcular_total());
