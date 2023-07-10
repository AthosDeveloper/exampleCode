
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Exemplo {
    public static void main(String[] args) {
                Connection connection = null;
                try {
                    // Carrega o driver JDBC do PostgreSQL
                    Class.forName("org.postgresql.Driver");

                    // Cria uma conexão com o banco de dados
                    connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/meu_banco_de_dados",
                            "usuario",
                            "senha");

                    // Executa uma consulta SQL
                    // ...

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (connection != null) {
                            connection.close();
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
