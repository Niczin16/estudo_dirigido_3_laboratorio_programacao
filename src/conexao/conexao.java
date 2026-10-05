package conexao;

// 1. IMPORTAÇÕES CORRETAS
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; // <-- Faltava essa importação
import java.sql.SQLException;

public class conexao { 
    
    // Método para conectar ao banco de dados
    public static Connection conectar() {
        String url = "jdbc:mysql://localhost:3306/DADOS"; 
        String usuario = "root";
        String senha = ""; 

        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
    
    // 2. CORREÇÃO: Colocamos o código de inserção dentro de um método próprio
    public static void inserirHeroi() {
        // Criamos a consulta SQL (Note que mudei 'nivel' para 'vida', que usamos nos passos anteriores)
        String sql = "INSERT INTO heroi (nome, poder, vida) VALUES (?, ?, ?)";

        // Abrimos a conexão e preparamos o comando de forma segura (try-with-resources)
        try (Connection conn = conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Se a conexão falhar, interrompe o método
            if (conn == null) {
                System.out.println("Não foi possível inserir pois a conexão é nula.");
                return;
            }

            // Preenchemos os parâmetros do '?'
            stmt.setString(1, "Batman");
            stmt.setString(2, "Inteligência");
            stmt.setInt(3, 500); // Passando a vida do herói

            // Executa o comando no banco de dados
            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Herói inserido com sucesso! Linhas afetadas: " + linhasAfetadas);
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir herói: " + e.getMessage());
        }
    }

}
