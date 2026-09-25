# Histórias de Usuário — Sistema de Matrículas

**Pedro Augusto Periceles de Paiva Milarde**
**Santhiago Takaesu Sampaio**

## 1. Login

**Como** usuário do sistema,
**quero** realizar login utilizando meu usuário e senha,
**para** acessar as funcionalidades disponíveis para o meu perfil.

### Critérios de aceitação

* O sistema deve solicitar usuário e senha.
* O sistema deve validar as credenciais informadas.
* O sistema deve permitir o acesso somente quando as credenciais forem válidas.

---

## 2. Consultar disciplinas

**Como** aluno,
**quero** consultar as disciplinas disponíveis para matrícula,
**para** escolher as disciplinas que desejo cursar no próximo semestre.

### Critérios de aceitação

* O sistema deve apresentar as disciplinas disponíveis.
* O sistema deve permitir que o aluno consulte as informações das disciplinas.
* O aluno deve conseguir visualizar quais disciplinas estão disponíveis para matrícula.

---

## 3. Realizar matrícula

**Como** aluno,
**quero** realizar minha matrícula nas disciplinas,
**para** definir as disciplinas que cursarei no próximo semestre.

### Critérios de aceitação

* A matrícula deve ocorrer somente durante o período de matrículas.
* O aluno pode selecionar até **4 disciplinas como primeira opção (obrigatórias)**.
* O aluno pode selecionar até **2 disciplinas alternativas (optativas)**.
* A matrícula deve respeitar o limite máximo de **60 alunos por disciplina**.
* Após a realização da matrícula, o sistema deve notificar o sistema de cobranças.
* A disciplina somente será ativa no semestre seguinte caso tenha pelo menos **3 alunos matriculados** ao final do período de matrículas.

---

## 4. Cancelar matrícula

**Como** aluno,
**quero** cancelar uma matrícula realizada anteriormente,
**para** alterar minhas escolhas durante o período permitido.

### Critérios de aceitação

* O cancelamento deve ser permitido somente durante o período de matrículas.
* O aluno deve conseguir visualizar suas matrículas realizadas.
* O aluno deve conseguir cancelar uma matrícula realizada anteriormente.

---

## 5. Consultar alunos matriculados

**Como** professor,
**quero** consultar os alunos matriculados em cada disciplina,
**para** saber quais alunos participarão da disciplina.

### Critérios de aceitação

* O professor deve conseguir acessar o sistema após realizar login.
* O professor deve conseguir consultar as disciplinas relacionadas a ele.
* O sistema deve apresentar os alunos matriculados em cada disciplina.

---

## 6. Gerar currículo semestral

**Como** secretaria da universidade,
**quero** gerar o currículo de cada semestre,
**para** definir a estrutura de disciplinas que será disponibilizada aos alunos.

### Critérios de aceitação

* A secretaria deve conseguir criar o currículo de um semestre.
* O currículo deve ser composto por diversas disciplinas.
* O sistema deve manter as informações referentes ao currículo.

---

## 7. Manter disciplinas

**Como** secretaria da universidade,
**quero** cadastrar e manter as informações das disciplinas,
**para** disponibilizá-las corretamente no sistema de matrículas.

### Critérios de aceitação

* A secretaria deve conseguir cadastrar disciplinas.
* A secretaria deve conseguir manter as informações das disciplinas.
* As disciplinas devem estar associadas aos cursos correspondentes.

---

## 8. Manter professores

**Como** secretaria da universidade,
**quero** manter as informações dos professores,
**para** que o sistema possua os dados necessários para o gerenciamento das disciplinas.

### Critérios de aceitação

* A secretaria deve conseguir cadastrar professores.
* A secretaria deve conseguir manter as informações dos professores.

---

## 9. Manter alunos

**Como** secretaria da universidade,
**quero** manter as informações dos alunos,
**para** que os dados dos estudantes estejam disponíveis no sistema de matrículas.

### Critérios de aceitação

* A secretaria deve conseguir cadastrar alunos.
* A secretaria deve conseguir manter as informações dos alunos.

---

## 10. Notificar sistema de cobranças

**Como** sistema de matrículas,
**quero** notificar o sistema de cobranças após a matrícula de um aluno,
**para** que o aluno possa ser cobrado pelas disciplinas daquele semestre.

### Critérios de aceitação

* A notificação deve ocorrer após a realização da matrícula.
* O sistema de cobranças deve receber a informação necessária referente à matrícula do aluno.
* A cobrança deve considerar as disciplinas nas quais o aluno realizou matrícula.
