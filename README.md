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
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class IPhone {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    IPhone implements ReprodutorMusical
    IPhone implements AparelhoTelefonico
    IPhone implements NavegadorInternet


---

👩‍💻 Desenvolvido por
Bárbara 💙
Arquiteta e Desenvolvedora em formação
