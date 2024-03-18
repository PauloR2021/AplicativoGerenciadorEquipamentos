/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.SoftwarePR.Redes.Banco;

import br.com.SoftwarePR.Redes.Construtor.ConstrutorCelular;
import br.com.SoftwarePR.Redes.Construtor.ConstrutorImpressora;
import br.com.SoftwarePR.Redes.Construtor.ConstrutorMaquinas;
import br.com.SoftwarePR.Redes.Construtor.ConstrutorRoteador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Ricardo
 */
public class ConexaoBanco {

    private Connection conexao;

    //Metodo de Conexão com o Banco de Dados
    public Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:ucanaccess://BancoDados.accdb");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Erro no Banco de Dados" + e);
        }
        return null;

    }

    //Metodo para fazer uma Consulta em Todo o Banco de Dados
    public List<ConstrutorImpressora> ConsutarImpressoras(String busca) {

        List<ConstrutorImpressora> lista = new ArrayList<>();

        this.conexao = new ConexaoBanco().getConnection();

        String sql = "Select * from impressoras where gest like ? OR ip like ? OR ua like  ?";

        try {

            PreparedStatement consultarInformacao = conexao.prepareStatement(sql);

            consultarInformacao.setString(1, busca);
            consultarInformacao.setString(2, busca);
            consultarInformacao.setString(3, busca);

            ResultSet resultado = consultarInformacao.executeQuery();

            while (resultado.next()) {

                ConstrutorImpressora linha = new ConstrutorImpressora();

                linha.setId(resultado.getInt("id"));
                linha.setGest(resultado.getString("gest"));
                linha.setIp(resultado.getString("ip"));
                linha.setUa(resultado.getString("ua"));
                linha.setLocal(resultado.getString("local"));
                linha.setMac(resultado.getString("mac"));
                linha.setXoa(resultado.getString("xoa"));
                lista.add(linha);
            }

            return lista;

        } catch (SQLException e) {
            // TODO Auto-generated catch block

        }
        return null;

    }

    public List<ConstrutorRoteador> ConsultarRoteador(String busca) {

        List<ConstrutorRoteador> lista = new ArrayList<>();

        this.conexao = new ConexaoBanco().getConnection();

        String sql = "Select * from roteadores where nome_rede like ?";

        try {
            PreparedStatement consultarInformacao = conexao.prepareStatement(sql);

            consultarInformacao.setString(1, busca);
            //consultarInformacao.setString(2, busca);

            ResultSet resultado = consultarInformacao.executeQuery();

            while (resultado.next()) {

                ConstrutorRoteador linha = new ConstrutorRoteador();

                linha.setId(resultado.getInt("id"));
                linha.setUa(resultado.getString("ua"));
                linha.setNomeRede(resultado.getString("nome_rede"));
                linha.setUsuarioAdm(resultado.getString("usuariO_adm"));
                linha.setSenhaAdm(resultado.getString("senha_adm"));
                linha.setSenhaRede(resultado.getString("senha_rede"));
                linha.setObservacao(resultado.getString("observacao"));

                lista.add(linha);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

        }
        return null;

    }

    public List<ConstrutorCelular> ConsultarCelulares(String busca) {

        List<ConstrutorCelular> lista = new ArrayList<>();

        this.conexao = new ConexaoBanco().getConnection();

        String sql = "Select * from celulares where nome like ? OR funcao like ? OR ua like ?"
                + "OR celular like ? OR patrimonio like ?";

        try {

            PreparedStatement consultarInformacao = conexao.prepareStatement(sql);

            consultarInformacao.setString(1, busca);
            consultarInformacao.setString(2, busca);
            consultarInformacao.setString(3, busca);
            consultarInformacao.setString(4, busca);
            consultarInformacao.setString(5, busca);

            ResultSet resultado = consultarInformacao.executeQuery();

            while (resultado.next()) {

                ConstrutorCelular linha = new ConstrutorCelular();

                linha.setId(resultado.getInt("id"));
                linha.setNome(resultado.getString("nome"));
                linha.setFuncao(resultado.getString("funcao"));
                linha.setUa(resultado.getString("ua"));
                linha.setCelular(resultado.getString("celular"));
                linha.setTelefone(resultado.getString("numero"));
                linha.setModelo(resultado.getString("modelo"));
                linha.setSerial(resultado.getString("serial"));
                linha.setImei(resultado.getString("imei"));
                linha.setPatrimonio(resultado.getString("patrimonio"));
                linha.setEmail(resultado.getString("email"));
                linha.setSenhaemail(resultado.getString("senhaEmail"));
                linha.setSenha(resultado.getString("senha"));
                lista.add(linha);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

        }
        return null;

    }

    public List<ConstrutorMaquinas> ConsultarMaquinas(String busca) {

        List<ConstrutorMaquinas> lista = new ArrayList<>();

        this.conexao = new ConexaoBanco().getConnection();

        String sql = "Select * from maquinas where hostname like ? OR colaborador like ? OR ua like ?"
                + "OR equipamento  like ? OR serial like ? OR patrimonio like ?";

        try {

            PreparedStatement consultarInformacao = conexao.prepareStatement(sql);

            consultarInformacao.setString(1, busca);
            consultarInformacao.setString(2, busca);
            consultarInformacao.setString(3, busca);
            consultarInformacao.setString(4, busca);
            consultarInformacao.setString(5, busca);
            consultarInformacao.setString(6, busca);

            ResultSet resultado = consultarInformacao.executeQuery();

            while (resultado.next()) {

                ConstrutorMaquinas linha = new ConstrutorMaquinas();

                linha.setId(resultado.getInt("id"));
                linha.setHostname(resultado.getString("hostname"));
                linha.setColaborador(resultado.getString("colaborador"));
                linha.setUa(resultado.getString("ua"));
                linha.setEquipamento(resultado.getString("equipamento"));
                linha.setModelo(resultado.getString("modelo"));
                linha.setSistema(resultado.getString("sistema"));
                linha.setSsd(resultado.getString("ssd"));
                linha.setRam(resultado.getString("ram"));
                linha.setSerial(resultado.getString("serial"));
                linha.setPatrimonio(resultado.getString("patrimonio"));
                lista.add(linha);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

        }
        return null;

    }

    //Metodo para Adicionar dados no Banco de Dados
    public void AdicionarImpressora(ConstrutorImpressora objeto) {

        String sql = "INSERT INTO impressoras(gest,ip,local,ua,mac,xoa)"
                + "values(?,?,?,?,?,?)";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);

            gravardados.setString(1, objeto.getGest());
            gravardados.setString(2, objeto.getIp());
            gravardados.setString(3, objeto.getLocal());
            gravardados.setString(4, objeto.getUa());
            gravardados.setString(5, objeto.getMac());
            gravardados.setString(6, objeto.getXoa());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Impressora Salva com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar Dados" + ex.getMessage(), "Error", 0);
        }
    }

    public void AdicionarRoteador(ConstrutorRoteador objeto) {

        String sql = "INSERT INTO roteadores (ua,nome_rede,usuario_adm,senha_adm,senha_rede,observacao)"
                + "values(?,?,?,?,?,?)";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);
            gravardados.setString(1, objeto.getUa());
            gravardados.setString(2, objeto.getNomeRede());
            gravardados.setString(3, objeto.getUsuarioAdm());
            gravardados.setString(4, objeto.getSenhaAdm());
            gravardados.setString(5, objeto.getSenhaRede());
            gravardados.setString(6, objeto.getObservacao());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Roteador Salv0 com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar os Dados do Roteador" + ex.getMessage(), "Error", 0);
        }
    }

    public void AdicionarCelular(ConstrutorCelular objeto) {

        String sql = "INSERT INTO celulares (nome,funcao,ua,celular,numero,modelo,serial,imei,patrimonio,email,senhaEmail,senha)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);
            gravardados.setString(1, objeto.getNome());
            gravardados.setString(2, objeto.getFuncao());
            gravardados.setString(3, objeto.getUa());
            gravardados.setString(4, objeto.getCelular());
            gravardados.setString(5, objeto.getTelefone());
            gravardados.setString(6, objeto.getModelo());
            gravardados.setString(7, objeto.getSerial());
            gravardados.setString(8, objeto.getImei());
            gravardados.setString(9, objeto.getPatrimonio());
            gravardados.setString(10, objeto.getEmail());
            gravardados.setString(11, objeto.getSenhaemail());
            gravardados.setString(12, objeto.getSenha());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Celular Salvo com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar os Dados do Celular" + ex.getMessage(), "Error", 0);
        }
    }

    public void AdicionarMaquinas(ConstrutorMaquinas objeto) {

        String sql = "INSERT INTO maquinas (hostname,colaborador,ua,equipamento,modelo,sistema,ssd,ram,serial,patrimonio)"
                + "values(?,?,?,?,?,?,?,?,?,?)";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);
            gravardados.setString(1, objeto.getHostname());
            gravardados.setString(2, objeto.getColaborador());
            gravardados.setString(3, objeto.getUa());
            gravardados.setString(4, objeto.getEquipamento());
            gravardados.setString(5, objeto.getModelo());
            gravardados.setString(6, objeto.getSistema());
            gravardados.setString(7, objeto.getSsd());
            gravardados.setString(8, objeto.getRam());
            gravardados.setString(9, objeto.getSerial());
            gravardados.setString(10, objeto.getPatrimonio());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Maquina Salva com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar os Dados da Maquina" + ex.getMessage(), "Error", 0);
        }
    }

    //Metodo para Alterar dados no Banco de Dados
    public void AlterarImpressora(ConstrutorImpressora objeto) {
        String sql = "UPDATE impressoras set gest=?,ip=?,ua=?,local=?,mac=?,xoa=?"
                + "WHERE id=? ";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);

            gravardados.setString(1, objeto.getGest());
            gravardados.setString(2, objeto.getIp());
            gravardados.setString(3, objeto.getUa());
            gravardados.setString(4, objeto.getLocal());
            gravardados.setString(5, objeto.getMac());
            gravardados.setString(6, objeto.getXoa());
            gravardados.setInt(7, objeto.getId());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Impressora Alterada com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar Dados" + ex.getMessage(), "Error", 0);
        }

    }

    public void AlterarRoteadores(ConstrutorRoteador objeto) {
        String sql = "UPDATE roteadores set ua=?,nome_rede=?,usuario_adm=?,senha_adm=?,senha_rede=?,observacao=? "
                + "WHERE id=? ";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);

            gravardados.setString(1, objeto.getUa());
            gravardados.setString(2, objeto.getNomeRede());
            gravardados.setString(3, objeto.getUsuarioAdm());
            gravardados.setString(4, objeto.getSenhaAdm());
            gravardados.setString(5, objeto.getSenhaRede());
            gravardados.setString(6, objeto.getObservacao());
            gravardados.setInt(7, objeto.getId());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Roteador Alterado com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar Dados" + ex.getMessage(), "Error", 0);
        }

    }

    public void AlterarCelulares(ConstrutorCelular objeto) {
        String sql = "UPDATE celulares set nome=?,funcao=?,ua=?,celular=?,numero=?,modelo=?,serial=?,"
                + "imei=?,patrimonio=?,email=?,senhaEmail=?,senha=?"
                + "WHERE id=? ";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);

            gravardados.setString(1, objeto.getNome());
            gravardados.setString(2, objeto.getFuncao());
            gravardados.setString(3, objeto.getUa());
            gravardados.setString(4, objeto.getCelular());
            gravardados.setString(5, objeto.getTelefone());
            gravardados.setString(6, objeto.getModelo());
            gravardados.setString(7, objeto.getSerial());
            gravardados.setString(8, objeto.getImei());
            gravardados.setString(9, objeto.getPatrimonio());
            gravardados.setString(10, objeto.getEmail());
            gravardados.setString(11, objeto.getSenhaemail());
            gravardados.setString(12, objeto.getSenha());
            gravardados.setInt(13, objeto.getId());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Celular Alterado com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar Dados" + ex.getMessage(), "Error", 0);
        }

    }

    public void AlterarMaquinas(ConstrutorMaquinas objeto) {
        String sql = "UPDATE maquinas set hostname=?,colaborador=?,ua=?,equipamento=?,modelo=?,sistema=?,ssd=?,ram=?,"
                + "serial=?,patrimonio=?"
                + "WHERE id=? ";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);

            gravardados.setString(1, objeto.getHostname());
            gravardados.setString(2, objeto.getColaborador());
            gravardados.setString(3, objeto.getUa());
            gravardados.setString(4, objeto.getEquipamento());
            gravardados.setString(5, objeto.getModelo());
            gravardados.setString(6, objeto.getSistema());
            gravardados.setString(7, objeto.getSsd());
            gravardados.setString(8, objeto.getRam());
            gravardados.setString(9, objeto.getSerial());
            gravardados.setString(10, objeto.getPatrimonio());
            gravardados.setInt(11, objeto.getId());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Maquinas Alterado com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar Dados" + ex.getMessage(), "Error", 0);
        }

    }

    //Metodo para Excluir dados no Banco de Dados
    public void ExcluirImpressora(ConstrutorImpressora objeto) {
        String sql = "DELETE impressoras WHERE id=? ";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);

            gravardados.setInt(1, objeto.getId());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Impressora Excluida com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Dados" + ex.getMessage(), "Error", 0);
        }

    }

    public void ExcluirRoteador(ConstrutorRoteador objeto) {
        String sql = "DELETE roteadores WHERE id=? ";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);

            gravardados.setInt(1, objeto.getId());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Roteador Excluido com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Dados" + ex.getMessage(), "Error", 0);
        }

    }

    public void ExcluirCelular(ConstrutorCelular objeto) {
        String sql = "DELETE celulares WHERE id=? ";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);

            gravardados.setInt(1, objeto.getId());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Celular Excluido com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Dados" + ex.getMessage(), "Error", 0);
        }

    }

    public void ExcluirMaquinas(ConstrutorMaquinas objeto) {
        String sql = "DELETE maquinas WHERE id=? ";

        try {

            this.conexao = new ConexaoBanco().getConnection();

            PreparedStatement gravardados = conexao.prepareStatement(sql);

            gravardados.setInt(1, objeto.getId());

            gravardados.execute();

            JOptionPane.showMessageDialog(null, "Maquina Excluido com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Dados" + ex.getMessage(), "Error", 0);
        }

    }

    //Metodo para Gerar Relatorios em TXT
    public List<ConstrutorCelular> RelatorioCelular() {

        List<ConstrutorCelular> lista = new ArrayList<>();

        this.conexao = new ConexaoBanco().getConnection();

        String sql = "Select * from celulares";

        try {

            PreparedStatement consultarInformacao = conexao.prepareStatement(sql);
            ResultSet resultado = consultarInformacao.executeQuery();

            while (resultado.next()) {

                ConstrutorCelular linha = new ConstrutorCelular();
                linha.setId(resultado.getInt("id"));
                linha.setNome(resultado.getString("nome"));
                linha.setFuncao(resultado.getString("funcao"));
                linha.setUa(resultado.getString("ua"));
                linha.setCelular(resultado.getString("celular"));
                linha.setTelefone(resultado.getString("numero"));
                linha.setModelo(resultado.getString("modelo"));
                linha.setSerial(resultado.getString("serial"));
                linha.setImei(resultado.getString("imei"));
                linha.setPatrimonio(resultado.getString("patrimonio"));
                linha.setEmail(resultado.getString("email"));
                linha.setSenhaemail(resultado.getString("senhaEmail"));
                linha.setSenha(resultado.getString("senha"));
                lista.add(linha);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

        }
        return null;

    }

    public List<ConstrutorImpressora> RelatorioImpressora() {

        List<ConstrutorImpressora> lista = new ArrayList<>();

        this.conexao = new ConexaoBanco().getConnection();

        String sql = "Select * from impressoras ";

        try {

            PreparedStatement consultarInformacao = conexao.prepareStatement(sql);

            ResultSet resultado = consultarInformacao.executeQuery();

            while (resultado.next()) {

                ConstrutorImpressora linha = new ConstrutorImpressora();

                linha.setId(resultado.getInt("id"));
                linha.setGest(resultado.getString("gest"));
                linha.setIp(resultado.getString("ip"));
                linha.setUa(resultado.getString("ua"));
                linha.setLocal(resultado.getString("local"));
                lista.add(linha);
            }

            return lista;

        } catch (SQLException e) {
            // TODO Auto-generated catch block

        }
        return null;

    }

    public List<ConstrutorMaquinas> RelatorioMaquinas() {

        List<ConstrutorMaquinas> lista = new ArrayList<>();

        this.conexao = new ConexaoBanco().getConnection();

        String sql = "Select * from maquinas ";

        try {

            PreparedStatement consultarInformacao = conexao.prepareStatement(sql);

            ResultSet resultado = consultarInformacao.executeQuery();

            while (resultado.next()) {

                ConstrutorMaquinas linha = new ConstrutorMaquinas();

                linha.setId(resultado.getInt("id"));
                linha.setHostname(resultado.getString("hostname"));
                linha.setColaborador(resultado.getString("colaborador"));
                linha.setUa(resultado.getString("ua"));
                linha.setEquipamento(resultado.getString("equipamento"));
                linha.setModelo(resultado.getString("modelo"));
                linha.setSistema(resultado.getString("sistema"));
                linha.setSsd(resultado.getString("ssd"));
                linha.setRam(resultado.getString("ram"));
                linha.setSerial(resultado.getString("serial"));
                linha.setPatrimonio(resultado.getString("patrimonio"));
                lista.add(linha);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

        }
        return null;

    }

    public List<ConstrutorRoteador> RelatorioRoteador() {

        List<ConstrutorRoteador> lista = new ArrayList<>();

        this.conexao = new ConexaoBanco().getConnection();

        String sql = "Select * from roteadores";

        try {
            PreparedStatement consultarInformacao = conexao.prepareStatement(sql);

            ResultSet resultado = consultarInformacao.executeQuery();

            while (resultado.next()) {

                ConstrutorRoteador linha = new ConstrutorRoteador();

                linha.setId(resultado.getInt("id"));
                linha.setUa(resultado.getString("ua"));
                linha.setNomeRede(resultado.getString("nome_rede"));
                linha.setUsuarioAdm(resultado.getString("usuariO_adm"));
                linha.setSenhaAdm(resultado.getString("senha_adm"));
                linha.setSenhaRede(resultado.getString("senha_rede"));
                linha.setObservacao(resultado.getString("observacao"));

                lista.add(linha);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

        }
        return null;

    }

    public void DesconectarBanco() throws SQLException {
        this.conexao = new ConexaoBanco().getConnection();
        if (conexao != null && !conexao.isClosed()) {
            conexao.close();
        }
    }

}
