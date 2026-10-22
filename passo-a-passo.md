# Passo a Passo: Configuração do Driver MySQL no Apache NetBeans

[Importante fazer antes de configurar a conexão com o banco de dados]

Este guia descreve como corrigir o erro de carregamento do driver JDBC ("No suitable driver found") substituindo o arquivo compactado `.zip` pelo arquivo executável `.jar` correto nas bibliotecas do projeto.

---

## 🛠️ Passo 1: Remover o arquivo `.zip` das Libraries

O NetBeans não consegue ler as classes diretamente de uma pasta compactada. Siga as instruções abaixo para limpar a referência antiga:

1. Na aba lateral esquerda (**Projects**) do NetBeans, expanda a pasta **Libraries** do seu projeto `AtividadeLigaHerois`.
2. Clique com o **botão direito** sobre o arquivo `mysql-connector-j-26.7.0.zip`.
3. Escolha a opção **Remove** (Remover).

---

## 📂 Passo 2: Extrair o Arquivo no Computador

Antes de voltar ao NetBeans, você deve descompactar os arquivos do driver no seu sistema operacional:

1. Abra o gerenciador de arquivos do seu computador (Windows Explorer) e vá até a pasta onde está o download do driver (`mysql-connector-j-26.7.0.zip`).
2. Clique com o **botão direito** no arquivo `.zip`.
3. Selecione **"Extrair Aqui"** ou **"Extrair Tudo"**. 
4. Uma nova pasta com o mesmo nome será gerada. Entre nela e você verá o arquivo executável Java chamado **`mysql-connector-j-26.7.0.jar`** (com o ícone de uma canequinha de café ou um arquivo de sistema).

---

## ☕ Passo 3: Adicionar o arquivo `.jar` correto ao NetBeans

1. Volte ao NetBeans e clique com o **botão direito** na pasta **Libraries** do seu projeto.
2. Escolha a opção **Add JAR/Folder...**.
3. Navegue até a pasta que você extraiu no **Passo 2**.
4. Selecione o arquivo **`mysql-connector-j-26.7.0.jar`** e clique em **Abrir**.
5. Verifique se o ícone listado agora corresponde a um arquivo `.jar` sob a árvore de bibliotecas.

---

## 📝 Passo 4: Conferir as Classes do Projeto

Certifique-se de que os seus códigos estão corrigidos com a sintaxe correta da URL e a estrutura de pacotes:

### `Conexao.java`
```java
package atividadeligaherois;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // Atenção: Apenas um dois-pontos após o jdbc (jdbc:mysql://)
    private static final String URL = "jdbc:mysql://localhost:3307/aula20261019";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public static Connection conectar(){
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão realizada com sucesso!");
            return con;
        } catch(SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
```

### `AtividadeLigaHerois.java`
```java
package atividadeligaherois;

public class AtividadeLigaHerois {

    public static void main(String[] args) {
        // Executa a tentativa de conexão criada na outra classe
        Conexao.conectar();
    }
}
```

---

## 🚀 Passo 5: Testar a Conexão
Clique no botão **Run Project (F6)**. O console do NetBeans deverá exibir a mensagem de sucesso:
`Conexão realizada com sucesso! BUILD SUCCESSFUL`
