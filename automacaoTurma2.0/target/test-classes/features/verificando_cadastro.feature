# language: pt

Funcionalidade: Cadastro de Usuário

Cenario: Preenchimento de Dados do Veiculo
 Dado O Menu dados do veiculo
 Quando Todos os dados do veiculo são preenchidos
 Entao O menu Enter Insurant Data deve ser exibido


Cenario: Mensagem de e-mail enviado com sucesso
 Dado O Registro de Usuário
 Quando Todos os dados são preenchidos
 Entao Um Popup com a mensagem "Sending e-mail success!" deve ser exibida
