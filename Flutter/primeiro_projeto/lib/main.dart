import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Flutter First App',
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        home: Scaffold(
          appBar: AppBar(
            title: const Text('Tarefas'),
          ),
          body: ListView(
            children: [
              Task('Minha tarefa'),
              Task('Flutter'),
              Task('Java'),
              Task('Javascript'),
              Task('C++'),
              Task('Python'),
              Task('Dart'),
              Task('C'),
              Task('Assembly'),
              Task('React'),
            ],
          ),
        ));
  }
}

class Task extends StatelessWidget {
  final String task;
  const Task(this.task, {super.key});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(8.0),
      child: Container(
        child: Stack(children: [
          Container(
            color: Colors.blue,
            height: 140,
          ),
          Container(
            height: 100,
            color: Colors.white,
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Container(
                  width: 72,
                  height: 100,
                  color: Colors.black26,
                ),
                Text(
                  task,
                  style:
                      TextStyle(fontSize: 24, overflow: TextOverflow.ellipsis),
                ),
                ElevatedButton(
                    onPressed: () {},
                    child: Icon(
                      Icons.arrow_drop_up,
                      color: Colors.white,
                    ))
              ],
            ),
          )
        ]),
      ),
    );
  }
}
