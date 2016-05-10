/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.relatorio.service;

import br.edu.ifpb.pos.relatorio.entidades.ContaPagamento;
import br.edu.ifpb.pos.relatorio.entidades.Fornecedor;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.restlet.resource.ClientResource;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
public class RelatorioService {

    public Fornecedor getFornecedor(Long idFornecedor) throws MalformedURLException, RemoteException {
        URL url = new URL("https://pos-webservice.herokuapp.com/fornecedores?wsdl");
        QName qName = new QName("http://service.fornecedor.pos.ifpb.edu.br/", "FornecedorService");
        Service service = Service.create(url, qName);
        FornecedorService fornecedorService = service.getPort(FornecedorService.class);
        return fornecedorService.recuperar(idFornecedor);
    }

    public List<ContaPagamento> getContasPagamento(Long idFornecedor) {
        ClientResource clientResource
                = new ClientResource("https://controle-financeiro-automovel.herokuapp.com/fornecedor/1/contas-pagamento");
        ContaPagamento[] pagamentos = clientResource.get(ContaPagamento[].class);
        return Arrays.asList(pagamentos);
    }
}
