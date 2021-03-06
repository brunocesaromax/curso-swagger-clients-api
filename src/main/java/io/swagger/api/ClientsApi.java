/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.26).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Client;
import io.swagger.model.Clients;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-16T12:44:13.813Z")

@Validated
@Api(value = "clients", description = "the clients API")
@RequestMapping(value = "/clients-api/v1")
public interface ClientsApi {

    @ApiOperation(value = "Cadastro de um novo cliente.", nickname = "create", notes = "Esta operação tem por objetivo cadastrar um novo cliente.", response = Client.class, tags = {"Cadastro",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Sucesso ao cadastrar um novo cliente.", response = Client.class),
            @ApiResponse(code = 400, message = "Cadastro inválido."),
            @ApiResponse(code = 401, message = "Cadastro não autorizado."),
            @ApiResponse(code = 500, message = "Erro interno ao tentar realizar o cadastro.")})
    @RequestMapping(value = "/clients",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Client> create(@ApiParam(value = "", required = true) @Valid @RequestBody Client client);


    @ApiOperation(value = "Exclui um cliente existente por id.", nickname = "deleteById", notes = "Esta operação tem por objetivo excluir um cliente existente por id.", tags = {"Exclusao",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Sucesso ao excluir um cliente existente por id."),
            @ApiResponse(code = 400, message = "Exclusão inválida."),
            @ApiResponse(code = 401, message = "Exclusão não autorizada."),
            @ApiResponse(code = 404, message = "Nenhum cliente encontrado para a exclusão por id."),
            @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a exclusão por id.")})
    @RequestMapping(value = "/clients/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteById(@ApiParam(value = "Id do cliente", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "Consulta clientes existentes.", nickname = "find", notes = "Esta operação tem por objetivo consultar clientes existentes.", response = Clients.class, tags = {"Consulta",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Sucesso ao consultar clientes existentes.", response = Clients.class),
            @ApiResponse(code = 400, message = "Consulta inválida."),
            @ApiResponse(code = 401, message = "Consulta não autorizada."),
            @ApiResponse(code = 404, message = "Nenhum cliente encontrado para a consulta."),
            @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a consulta.")})
    @RequestMapping(value = "/clients/find",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Clients> find(@ApiParam(value = "Sobrenome do cliente") @Valid @RequestParam(value = "lastName", required = false) String lastName);


    @ApiOperation(value = "Consulta todos os clientes.", nickname = "findAll", notes = "Esta operação tem por objetivo consultar todos os clientes.", response = Clients.class, tags = {"Consulta",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Sucesso ao consultar todos os clientes.", response = Clients.class),
            @ApiResponse(code = 400, message = "Consulta inválida."),
            @ApiResponse(code = 401, message = "Consulta não autorizada."),
            @ApiResponse(code = 404, message = "Nenhum cliente encontrado para a consulta."),
            @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a consulta.")})
    @RequestMapping(value = "/clients",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Clients> findAll();


    @ApiOperation(value = "Consulta um cliente existente por id.", nickname = "findById", notes = "Esta operação tem por objetivo consultar um cliente existente por id.", response = Client.class, tags = {"Consulta",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Sucesso ao consultar um cliente existente por id.", response = Client.class),
            @ApiResponse(code = 400, message = "Consulta inválida."),
            @ApiResponse(code = 401, message = "Consulta não autorizada."),
            @ApiResponse(code = 404, message = "Nenhum cliente encontrado para a consulta por id."),
            @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a consulta por id.")})
    @RequestMapping(value = "/clients/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Client> findById(@ApiParam(value = "Id do cliente", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "Atualiza um cliente existente.", nickname = "update", notes = "Esta operação tem por objetivo atualizar um cliente existente.", response = Client.class, tags = {"Atualizacao",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Sucesso ao atualizar um cliente existente.", response = Client.class),
            @ApiResponse(code = 400, message = "Atualização inválida."),
            @ApiResponse(code = 401, message = "Atualização não autorizada."),
            @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a atualização.")})
    @RequestMapping(value = "/clients/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Client> update(@ApiParam(value = "Id do cliente", required = true) @PathVariable("id") Integer id, @ApiParam(value = "", required = true) @Valid @RequestBody Client client);


    @ApiOperation(value = "Atualiza o status de um cliente existente.", nickname = "updateStatus", notes = "Esta operação tem por objetivo atualizar o status de um cliente existente.", response = Client.class, tags = {"Atualizacao",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Sucesso ao atualizar o status de um cliente existente.", response = Client.class),
            @ApiResponse(code = 400, message = "Atualização de status de cliente inválida."),
            @ApiResponse(code = 401, message = "Atualização de status de cliente não autorizada."),
            @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a atualização de status de cliente.")})
    @RequestMapping(value = "/clients/{id}/status/{status}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Client> updateStatus(@ApiParam(value = "Id do cliente", required = true) @PathVariable("id") Integer id, @ApiParam(value = "Novo status do cliente", required = true, allowableValues = "\"active\", \"inactive\"") @PathVariable("status") String status);

}
