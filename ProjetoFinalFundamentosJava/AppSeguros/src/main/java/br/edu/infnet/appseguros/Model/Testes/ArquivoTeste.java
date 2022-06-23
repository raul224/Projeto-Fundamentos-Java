package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ArquivoTeste {
    public static void main(String[] args) {
        try {
            String dir = "c:/dev/";
            String arq = "orcamento.txt";

            try {
                FileReader fileR = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileR);

                FileWriter fileW = new FileWriter(dir+"out_"+arq);
                BufferedWriter escrita = new BufferedWriter(fileW);

                String linha = leitura.readLine();

                Orcamento orcamento = null;
                List<Seguro> Seguros = new ArrayList<Seguro>();

                while(linha != null) {
                    String[] campos = linha.split(";");

                    String opcao = campos[0];

                    switch (opcao.toUpperCase()) {
                        case "O":
                            Cliente cliente = new Cliente(campos[1], campos[2], campos[3]);
                            orcamento = new Orcamento();
                            orcamento.setCodigoOrcamento(ThreadLocalRandom.current().nextInt(1, 999 + 1));
                            orcamento.setCliente(cliente);
                            orcamento.setSeguros(Seguros);
                            break;
                        case "D":
                            try {
                                Domicilio domicilio = new Domicilio(campos[1], campos[2], Integer.parseInt(campos[3]),
                                        Float.parseFloat(campos[4]), Float.parseFloat(campos[5]));
                                domicilio.setCep(campos[6]);
                                domicilio.setMetragemImovel(Integer.parseInt(campos[7]));
                                domicilio.setCpfProprietario(campos[8]);

                                Seguros.add(domicilio);
                            } catch (Exception e) {
                                System.out.println("[ERRO] " + e.getMessage());
                            }

                            break;
                        case "M":
                            try {
                                Veiculo veiculo = new Veiculo(campos[1], campos[2], Integer.parseInt(campos[3]),
                                        Float.parseFloat(campos[4]), Float.parseFloat(campos[5]));
                                veiculo.setPlaca(campos[6]);
                                veiculo.setCRVL(campos[7]);
                                veiculo.setTipoVeiculo(campos[8]);

                                Seguros.add(veiculo);
                            } catch (Exception e) {
                                System.out.println("[ERRO] " + e.getMessage());
                            }
                            break;
                        case "V":
                            try {
                                Vida vida = new Vida(campos[1], campos[2], Integer.parseInt(campos[3]),
                                        Float.parseFloat(campos[4]), Float.parseFloat(campos[5]));
                                vida.setCpf(campos[6]);
                                vida.setAnoNascimento(Integer.parseInt(campos[7]));
                                vida.setCpfBeneficiario(campos[8]);

                                Seguros.add(vida);
                            } catch (Exception e) {
                                System.out.println("[ERRO] " + e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Tipo inválido!");
                            break;
                    }

                    linha = leitura.readLine();
                }

                if(orcamento != null){
                    escrita.write(orcamento.obterDadosArquivo());
                    System.out.println(orcamento);
                }

                leitura.close();
                fileR.close();
                escrita.close();
                fileW.close();
            } catch (IOException e) {
                System.out.println("[ERRO] " + e.getMessage());
            }
        } finally {
            System.out.println("PROCESSAMENTO REALIZADO!!!");
        }
    }
}