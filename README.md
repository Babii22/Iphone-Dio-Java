# 📱 Projeto iPhone - Java

Este projeto simula as funcionalidades do iPhone apresentadas em seu lançamento original em 2007. A proposta é criar um **modelo orientado a objetos utilizando Java**, com uso de **interfaces**, baseado nas funções principais:

- 🎵 Reprodutor Musical  
- ☎️ Aparelho Telefônico  
- 🌐 Navegador de Internet  

---

## Objetivo

Aplicar os conhecimentos de **POO**

Para criar:

- Um diagrama UML representando a estrutura do projeto;
- Interfaces para as funcionalidades do dispositivo;
- Uma classe principal `IPhone` implementando as interfaces;
- Um programa de teste (`Main`) para simular o uso do iPhone.

---

## 📊 Diagrama UML (Mermaid)

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class IPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    IPhone ..|> ReprodutorMusical
    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorInternet



---

👩‍💻 Desenvolvido por
Bárbara 💙
Arquiteta e Desenvolvedora em formação
