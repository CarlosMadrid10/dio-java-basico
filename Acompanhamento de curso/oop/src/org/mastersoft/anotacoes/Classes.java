//Convenções

// MVC
//As classes em Java são classificadas, como:
/*
    - model: Classes que representam a estrutura do domínio da aplicação, exemblo: Cliente, NotaFiscal e etc.
    - service: Classes que contém regra de negócio e validação de nosso sistema.
    - repository: classes que contém uma integração com banco de dados.
    - controller: classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http, web ou web services.
    - util: classe que contém recursos comuns à toda nossa aplicação. Exemplo: formatação de datas, calculo de ICMS e etc.
    - view: classes que possuem alguma interação com a interface gráfica acessada pelo usuário.
*/

// Algumas convenções
/*
    - Não se pode ter duas classes com o mesmo nome no mesmo pacote.
*/
package org.mastersoft.anotacoes;

public class Classes {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Git.");
    }
}
