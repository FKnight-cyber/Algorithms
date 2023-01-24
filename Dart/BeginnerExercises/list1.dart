main() {
  String apelido = "Ryan";
  String name = "Ryan Nicholas Maia Vieira";
  bool isGeek = true;
  double altura = 1.67;
  int idade = 26;


  List<dynamic> info = [apelido, name, isGeek, altura, idade];

  print('Eu sou ${info[0]} \n'
  'mas meu nome completo é ${info[1]} \n'
  'eu me considero geek? ${info[2]} \n'
  'Eu tenho ${info[3]} metros de altura e\n'
  '${info[4]} anos de idade');
}