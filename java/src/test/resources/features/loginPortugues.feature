#language: pt

  Funcionalidade: Tela de Login

      Esquema do Cenário: Paciente valido e senha válida
      Dado que o paciente está na página de login
      E o paciente preenche no campo "login" o valor "robson"
      E o paciente preenche no campo "password" o valor "<valor>"
      Quando o paciente clicar no botão login
      Então paciente deveria ver a mensagem de "<mensagem>"

        Exemplos:
          | valor   | mensagem       |
          | agapito | Success Login! |
          | teste   | Fail Login!    |


    Cenário: Paciente valido e senha inválida
      Dado que o paciente está na página de login
      E o paciente preenche no campo "login" o valor "robson"
      E o paciente preenche no campo "password" o valor "1234"
      Quando o paciente clicar no botão login
      Então paciente deveria ver a mensagem invalida igual a "Fail Login!"
