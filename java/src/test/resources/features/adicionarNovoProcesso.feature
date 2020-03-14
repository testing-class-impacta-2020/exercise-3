#language: pt

Funcionalidade: Adicionar um novo processo.

    Cenário de Fundo:
        Dado que o paciente está na página Agapito Software Testing
        E o paciente clicar no menu "processos"

    Cenário: Adicionar um novo processo com sucesso.
    E o paciente clicar no botão novo processo
    E o paciente digitar no campo "processo_vara" o valor "23"
    E o paciente digitar no campo "processo_numero_processo" o valor "7777"
    E o paciente digitar no campo "processo_natureza" o valor "Pós Graduação - Engenharia de Software - Impacta"
    E o paciente digitar no campo "processo_partes" o valor "Lucas x Matheus"
    E o paciente seleciona no campo urgencia o valor "Sim"
    E o paciente clica no campo arbitramento com o valor Sim
    E o paciente digitar no campo "processo_data_entrada" o valor "22/04/2010"
    E o paciente digitar no campo "processo_data_saida" o valor "22/04/2020"
    E o paciente digitar no campo "processo_status" o valor "Agendado"
    Quando o paciente clicar no botão "btn-save" na página de inclusão de processos
    Então o paciente deveria visualizar a mensagem "Processo foi criado com sucesso."

    Quando o paciente clicar em voltar
    Então o paciente deveria ver o texto "Lucas x Matheus"

    @ignore
    Cenário: Ler um processo com sucesso
    Quando o paciente clicar no botão "btn-show_473" na página de inclusão de processos
    Então no campo vara deve mostrar o conteúdo "Vara: 23"
    E no campo numero processo deve mostrar o conteúdo "Numero processo: 7777"

    Cenário: Alterar um processo com sucesso
    Quando o paciente clicar no botão "btn-edit_473" na página de inclusão de processos
    Então eu devo alterar o campo "processo_natureza" para o valor "Teste de Alteração"
    E eu devo alterar o campo urgente para o valor "Não"
    Quando o paciente clicar no botão "btn-save" na página de inclusão de processos
    Então o paciente deveria visualizar a mensagem "Processo atualizado com sucesso."

    Cenário: Delete um processo com sucesso
    E o paciente clicar no botão "btn-delete_493" na página de inclusão de processos
    Quando o paciente clicar no botão "OK"



    
