# 💡 Design Patterns em Java

Repositório com implementações dos principais Design Patterns em Java, mantido como exercício de reforço e referência pessoal.

---

## 📦 Padrões Criacionais

### 1. Singleton - Logger
**Desafio:** Implemente uma classe `Logger` que garante uma única instância em todo o sistema.  
**Instruções:**
- Use `private static` para armazenar a instância.
- Forneça um método `getInstance()`.

---

### 2. Factory Method - Notificações
**Desafio:** Crie uma fábrica de notificações (`NotificationFactory`) que pode instanciar `EmailNotification`, `SMSNotification` ou `PushNotification`.  
**Instruções:**
- Crie uma interface `Notification`.
- Crie classes concretas que implementam `Notification`.

---

### 3. Abstract Factory - Componentes de UI
**Desafio:** Crie uma fábrica para gerar componentes gráficos de acordo com o sistema operacional (`WindowsUIFactory`, `MacUIFactory`).  
**Instruções:**
- Crie interfaces para componentes (`Button`, `Checkbox`, etc).
- Implemente versões específicas para Windows e Mac.

---

### 4. Builder - Gerador de Relatórios
**Desafio:** Construa relatórios em diferentes formatos (PDF, HTML, CSV) usando um `ReportBuilder`.  
**Instruções:**
- Modele uma classe `ReportDirector` que usa o builder.
- Crie builders concretos para cada formato.

---

### 5. Prototype - Personagens de Jogo
**Desafio:** Modele um sistema onde personagens podem ser clonados a partir de um protótipo.  
**Instruções:**
- Use a interface `Cloneable`.
- Implemente o método `clone()` nas classes concretas.

---

## 🧱 Padrões Estruturais

### 6. Adapter - Sistema de Pagamento
**Desafio:** Adapte um sistema antigo de pagamento para funcionar com o novo sistema.  
**Instruções:**
- Crie um `PaymentAdapter` que traduz chamadas.

---

### 7. Bridge - Controle Remoto
**Desafio:** Separe abstração (`RemoteControl`) da implementação (`TV`, `Radio`).  
**Instruções:**
- A abstração chama métodos da implementação.

---

### 8. Composite - Sistema de Arquivos
**Desafio:** Modele pastas e arquivos onde pastas podem conter múltiplos elementos.  
**Instruções:**
- Use uma interface comum `FileSystemNode`.
- Implemente `File` e `Folder`.

---

### 9. Decorator - Cafeteria
**Desafio:** Permita adicionar ingredientes dinamicamente a um café.  
**Instruções:**
- Crie uma interface `Beverage`.
- Use decoradores para `Milk`, `Chocolate`, etc.

---

### 10. Facade - Compra Online
**Desafio:** Crie uma fachada (`OrderService`) que coordena `Inventory`, `Payment`, `Shipping`.  
**Instruções:**
- Crie subsistemas e encapsule em uma interface simples.

---

### 11. Flyweight - Editor de Texto
**Desafio:** Reutilize instâncias de caracteres para economizar memória.  
**Instruções:**
- Armazene caracteres compartilhados em uma `CharacterFactory`.

---

### 12. Proxy - Acesso ao Sistema de Arquivos
**Desafio:** Implemente um proxy de segurança para diferentes tipos de usuários.  
**Instruções:**
- Controle o acesso com base no tipo de usuário.

---

## 🤝 Padrões Comportamentais

### 13. Chain of Responsibility - Validador HTTP
**Desafio:** Crie validadores encadeados para autenticação, permissões e formato.  
**Instruções:**
- Cada handler deve delegar para o próximo se não processar.

---

### 14. Command - Controle Remoto
**Desafio:** Encapsule comandos como `ligar TV`, `aumentar volume`, etc.  
**Instruções:**
- Use uma interface `Command`.

---

### 15. Interpreter - Comandos Matemáticos
**Desafio:** Interprete expressões como `x = 5 + 3`.  
**Instruções:**
- Modele uma árvore de expressão e interprete.

---

### 16. Iterator - Playlist de Músicas
**Desafio:** Navegue por músicas com um iterador.  
**Instruções:**
- Crie um `MusicIterator`.

---

### 17. Mediator - Chat em Grupo
**Desafio:** Centralize a comunicação entre usuários via `ChatMediator`.  
**Instruções:**
- Os usuários se comunicam via o mediador.

---

### 18. Memento - Editor de Texto com Undo
**Desafio:** Permita salvar e restaurar o estado do texto.  
**Instruções:**
- Use objetos `Memento` para armazenar estados.

---

### 19. Observer - Alerta Meteorológico
**Desafio:** Dispositivos se atualizam automaticamente quando o clima muda.  
**Instruções:**
- Use uma interface `Observer`.

---

### 20. State - Máquina de Venda
**Desafio:** Altere comportamento baseado no estado da máquina.  
**Instruções:**
- Modele estados como objetos.

---

### 21. Strategy - Ordenação
**Desafio:** Implemente diferentes estratégias de ordenação.  
**Instruções:**
- Crie uma interface `SortStrategy`.

---

### 22. Template Method - Preparo de Bebidas
**Desafio:** Modele um processo com passos fixos e customizáveis.  
**Instruções:**
- Crie uma classe abstrata com o método `prepare()`.

---

### 23. Visitor - Cálculo de Impostos
**Desafio:** Aplique regras de impostos a diferentes produtos usando `Visitor`.  
**Instruções:**
- Implemente o padrão para evitar `instanceof`.