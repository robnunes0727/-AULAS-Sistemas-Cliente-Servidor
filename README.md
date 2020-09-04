

# Sistemas Cliente/Servidor: Instalando a IDE IntelliJ
Download da IDE: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows

**Índice**
 1. [Pedindo acesso ao e-mail .edu para a unicid](#1-pedindo-acesso-ao-e-mail-edu-para-a-unicid)
 2. [Pedindo acesso ao plano ultimate da IntelliJ](#2-pedindo-acesso-ao-plano-ultimate-da-intellij)
 3. [Acessando o e-mail .edu para confirmação do pedido](#3-acessando-e-mail-edu)
 4. [Vinculando a licença ultimate](#4-vinculando-a-licença-ultimate)
 5. [Instalando a IDE](#5-instalando-a-ide)
 6. [Configurando a IDE com a licença](#6-configurando-a-ide-com-a-licença)
 7. [Começando projeto com Spring](#7-começando-projeto-com-spring)
 8. [Instalando JDK pela IntelliJ](#8-instalando-jdk-pela-intellij)
 9. [Executando o código](#9-executando-o-c%C3%B3digo)

## 1. Pedindo acesso ao e-mail .edu para a unicid
**Caso você já tenha o e-mail: *RGM@aluno.cruzeirodosul.edu.br*, pule esta etapa.** 

Enviar um e-mail para `acesso.aluno@cruzeirodosul.edu.br` seguindo o modelo:
>Assunto: 
>>**Solicitação de acesso a área educacional da Microsoft**
>
>Corpo:
>
>>Nome: *--seu nome aqui--* <br/>
>>RGM: **17** *--seu rgm aqui--* <br/>
>>Curso: Análise e desenvolvimento de sistemas <br/>
>>Turma: *--**4A** ou **3A**--* <br/>
>> Periodo: Matutino <br/>

Após alguns dias, a UNICID responderá:
>>Assunto: **RE: Solicitação de acesso a área educacional da Microsoft**
>
>~~Prezado (a) Aluno (a),~~
>
>~~Seguem abaixo dados do cadastro:~~
>
>**Nome do usuário: *RGM@aluno.cruzeirodosul.edu.br*** <br/>
>**Senha: *senha***
>
>~~Será solicitado uma nova senha, que deverá conter oito caracteres, sendo pelo menos uma letra maiúscula e um número~~. 
>~~Você poderá utilizar o mesmo usuário e senha para acessar os serviços do Office365 e os da plataforma Azure.~~ 
>
>~~Siga os links abaixo:~~
>
>- ~~Para utilização do Office365:~~ <br/>
>~~office.com~~ 
> 
>- **Para acesso ao Azure Dev Tools for Teaching (ao entrar no site terá que aceitar os termos):
> https://aka.ms/devtoolsforteaching <br/>
> (É necessário fazer o “Aceite” do contrato de utilização, bem como entrar com todas as informações que forem solicitadas)**  
>
>- ~~Uma vez logado no sistema, acesse:~~ <br/>
>~~https://portal.azure.com/~~

Após completar os passos citados na resposta, o e-mail estará pronto para ser usado.

## 2. Pedindo acesso ao plano ultimate da IntelliJ
Acesse: https://www.jetbrains.com/shop/eform/students

E preencha assim: 

![Ajuste "Graduation date" de acordo com quando o curso irá acabar](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-form.png)
|:--:| 
| *Ajuste "Graduation date" de acordo com quando pretende terminar o curso* |

## 3. Acessando e-mail .edu
Para entrar na caixa de entrada do e-mail educaional, acesse: https://login.microsoftonline.com/ e entre com suas credenciais, depois clique em OUTLOOK.

![Clicar em outlook](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-outlook.png)
|:--:|

## 4. Vinculando a licença Ultimate
Na sua caixa de entrada, você receberá um e-mail da JetBrains, desenvolvedora da IDE.
>>Assunto: **JetBrains Educational Pack confirmation**
> 
> ~~Hi,~~
>
>~~You're receiving this email because your email address was used to register or update a JetBrains Educational Pack.~~
>
>**Please [follow this link](https://www.jetbrains.com/)  to confirm your intention.**
>
>~~After accepting the License Agreement, you will be asked to sign up for a JetBrains Account.  
You will need to use this account whenever you want to access JetBrains tools.~~
>
>~~If you have any questions, please email us – we’re always happy to help.~~
>
>~~Kind Regards,  
>The JetBrains team  
>[www.jetbrains.com](https://www.jetbrains.com/)  
>The Drive to Develop~~

Clique no link de confirmação, que abrirá a página:
![Preencha o campo marcado com um e-mail](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-jetcongrats.png)
|:--:|

Preencha o campo marcado na imagem com o e-mail educacional. 

Depois disso retorne a sua caixa de entrada e confirme novamente o e-mail.
>>Assunto: **Complete your account registration**
>
>~~Hello!~~
>
>~~Thank you for creating your JetBrains Account.~~
>
>**To complete your registration, click the link below:  
>[Confirm your account](https://account.jetbrains.com/)**
>
>~~Yours truly,  
>The JetBrains Team  
>[https://www.jetbrains.com](https://www.jetbrains.com)  
>The Drive to Develop~~ 

O link de confirmação pedirá outro formulário:

![Preencha todos os campos](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-jetacc.png)
|:--:|

Após preencher todos os campos e confirmar sua licença estará pronta para ser usada.

## 5. Instalando a IDE
Download da IDE: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows

Após terminar o download, dê next até a parte ***Configure your IntelliJ IDEA installation***:

![Marque essas opções](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-install1.png)
|:--:|
| Recomendadas as opções acima. |

E marque as opções:
- Add launchers dir to path.
- Download and install 32-bits JetBrains Runtime

Ao chegar na parte de reiniciar, marque para reiniciar depois:

![Quero reiniciar manualmente depois](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-install2.png)
|:--:|

## 6. Configurando a IDE com a licença
Abra a IDE, aceite os termos de usuário, envie ou não envie informações anonimas e então dê next até essa parte e instale o AWS toolkit:

![Adicione o AWS toolkit](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-config1.png)
|:--:|

Depois entre com seu login e senha, usados na parte 3.

![E-mail e senha](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-config2.png)
|:--:|

E pronto, sua IDE está ativada. Pode reiniciar o computador assim que for conveniente.

## 7. Começando projeto com Spring
Acesse: [https://start.spring.io/](https://start.spring.io/)
Configure assim:

![enter image description here](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-spring1.png)
|:--:|
| *Project: Maven - Language: Java - Spring Boot: 2.3.3* <br /> *Group: com.unicid - Artifact e Name: ~~depende da aula, professor vai passar~~* <br /> *Packaging: Jar - Java: 8*  |
E adicione a dependência **Spring Web** na lista da direita.

Ao terminar, clique em **GENERATE** e faça download do arquivo zip.

O arquivo zip terá o nome passado pelo professor. Extraia o arquivo numa pasta de fácil acesso, onde seus projetos ficarão. **Recomendado uma pasta na raiz do disco para evitar erros. Exemplo: C:/aulasSC/aula1**

Abra a IntelliJ, e na tela inicial clique em **Open or import**, e então aponte para a pasta extraída.

Com o projeto aberto, comece a programar dentro da pasta **src > main > java**. 

## 8. Instalando JDK pela IntelliJ 
Caso você não tenha a JDK instalada, não poderá rodar os programas. 

Para resolver isso, acesse: **File > Project Structure > Platform Settings > SDKs e clique em Download JDK** 

Escolha o JDK da Oracle.

## 9. Executando o código
Aperte o botão **Control** duas vezes, aparecerá um menu pedindo código. 

Também é possivel clicar em **terminal**, na barra inferior da IDE.

Digite: `mvn spring-boot:run` 

![Botão iniciar, parar e console Run](https://raw.githubusercontent.com/robnunes0727/Sistemas-Cliente-Servidor/tutorial/img-spring4.png)
|:--:|
| *Pode-se também usar o botão PLAY verde para rodar a aplicação, use o botão STOP vermelho para parar a execução caso faça alguma alteração no código* |

**~~TODO: PATH do Windows~~**
