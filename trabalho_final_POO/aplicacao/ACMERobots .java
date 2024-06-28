package aplicacao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import dados.Locacao;

public class ACMERobots  {

    public ACMERobots(){
        this.locacao = new Locacao();
    }

    public void executar(){
        cadastrarNovoRobo();
        cadastrarNovoCliente();
        cadastrarNovaLocacao();
        processarLocacoes();
        mostrarRelatorioGeral();
        consultarTodasAsLocacoes();
        alterarSituacaoLocacao();
        realizarCargaDadosIniciais();
        salvarDados();
        carregarDados();
        finalizarSistema();
    }

    public void cadastrarNovoRobo(){
        /*
        Cadastrar novo robô (solicita e cadastra os dados de um robô. [Se já houver robô
com o id (identificador) indicado, mostra uma mensagem de erro]. Os robôs são
mantidos em ordem crescente de id).

         */
    }

    public void cadastrarNovoCliente(){
        /*
        Cadastrar novo cliente (solicita e cadastra os dados de um cliente [se o código já
existir, mostra uma mensagem de erro]. Os clientes são mantidas em ordem crescente
de código).
         */
    }

    public void cadastrarNovaLocacao(){
        /*
        • Cadastrar nova locação (mostra os cliente cadastrados. O usuário seleciona um
cliente, e o sistema solicita e cadastra os dados de uma nova locação para o cliente
selecionado. O sistema mostra os robôs cadastrados e o usuário seleciona um ou mais
robôs para a locação [se o número da locação já existir mostra uma mensagem de
erro]. A nova locação é colocada em uma fila de locações pendentes).
         */
    }

    public void processarLocacoes(){
        /*
        • Processar locações (a partir da fila de locações pendentes; o sistema fará o
processamento automático de cada locação. Verifica se é possível locar cada robô
solicitado. Se todos os robôs solicitados forem locados, a locação passa para a
situação EXECUTANDO. Se algum robô não estiver disponível, todos os robôs já
locados são liberados e a locação retorna para a fila de locações pendentes. [Se não
há locações na fila de locações pendentes, mostra uma mensagem de erro]).
         */
    }

    public void mostrarRelatorioGeral(){
        /*
        • Mostrar relatório geral (mostra todos os dados de todos os robôs, clientes e locações
cadastrados [se não há nenhum dado cadastrado, mostra uma mensagem de erro]).
         */
    }

    public void consultarTodasAsLocacoes(){
        /*
        • Consultar todas as locações (mostra todas as locações cadastradas: todos os dados
das locações, incluindo os dados do cliente; se a locação possui robôs alocados,
mostra os dados de cada robô e o valor final da locação [se não há locações, mostra
uma mensagem de erro]).
         */
    }

    public void alterarSituacaoLocacao(){
        /*
        • Alterar a situação de uma locação (solicita o número de um locação; mostra os dados
da locação; solicita a nova situação [se não há locação com o código indicado, mostra
uma mensagem de erro; se o locação estiver na situação FINALIZADA ou
CANCELADA, não pode ser alterado e mostra uma mensagem de erro]).
         */
    }

    public void realizarCargaDadosIniciais(){
        /*
        • Realizar carga de dados iniciais do sistema (solicita o nome do arquivo (sem
extensão); carrega os dados dos arquivos para o sistema; as locações devem ser
carregadas em uma fila de locações pendentes; ao final da carga de dados iniciais,
mostra todos os dados de robôs, cliente e locações cadastrados [se houver problemas
na carga de dados, mostra uma mensagem de erro]). Veja o Apêndice sobre os
formatos dos arquivos de entrada.
         */
    }

    public void salvarDados(){
        /*
        • Salvar dados (solicita ao usuário um nome de arquivo (sem extensão) e salva todos
os dados cadastrados no sistema em um ou mais arquivos [se houver algum problema
no salvamento mostra uma mensagem de erro]).
         */
    }

    public void carregarDados(){
        /*
        - Carregar dados (solicita ao usuário um nome de arquivo (sem extensão) e carrega
para os sistema todos os dados de um ou mais arquivos [se houver algum problema
no carregamento mostra uma mensagem de erro]).
         */
    }

    public void finalizarSistema(){
        /*
        • Finalizar sistema (termina a execução do sistema).
         */
    }

    public void leLinhasTexto() {
        Path path1 = Paths.get("testetexto.txt");
        try (BufferedReader reader = Files.newBufferedReader(path1,
                Charset.defaultCharset())) {
            String line = null;
            int numLinha = 0;
            while ((line = reader.readLine()) != null) {
                numLinha++;
                System.out.println("Linha " + numLinha + ": " + line);
            }
        }
        catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }

    }

    public void gravaLinhasTexto() {
        Path path1 = Paths.get("testetexto.txt");
        // Abaixo: defaultCharset retorna a codificação padrão de
        // textos (usualmente UTF-8)
        try (PrintWriter writer = new PrintWriter (Files.newBufferedWriter(path1, Charset.defaultCharset()))) {
            writer.println("Escrevendo linha em arquivo texto");
            writer.println("Outra linha...");
        }
        catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }
    }
}
