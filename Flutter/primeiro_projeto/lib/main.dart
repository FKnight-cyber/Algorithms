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
            leading: Container(),
            title: const Text('Tarefas'),
          ),
          body: ListView(
            children: [
              Task('Dormir', 'https://www.drronsanimalhospitalsimivalley.com/wp-content/uploads/2018/11/Dog-Sleeping-Over-Mat.jpg'),
              Task('Flutter', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgZZOcHHzuMXdmgLHu8bUKA0Q45OjzhqBSw2oTkt85c_6xjU5fskEIDMh8B5jL6-KSQTo&usqp=CAU'),
              Task('Java', 'https://miro.medium.com/max/625/1*C-zXmTMHObZWyZBUbdruGg.jpeg'),
              Task('Javascript', 'https://thumbs.dreamstime.com/b/smart-working-dog-using-computer-typing-laptop-keyboard-designer-freelancer-remotely-home-pet-clothes-gray-jumper-hoodie-176711684.jpg'),
              Task('C++', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2k6bZcHGkeHdrlBkNpxSQ3YxNbIpNdFUXPQ&usqp=CAU'),
            ],
          ),
        ));
  }
}

class Task extends StatefulWidget {
  final String task;
  final String imageUrl;
  const Task(this.task, this.imageUrl, {super.key});

  @override
  State<Task> createState() => _TaskState();
}

class _TaskState extends State<Task> {
  int nivel = 0;
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
          Column(
            children: [
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
                      child: Image.network(widget.imageUrl, fit: BoxFit.cover,),
                    ),
                    Text(
                      widget.task,
                      style: TextStyle(
                          fontSize: 24, overflow: TextOverflow.ellipsis),
                    ),
                    Container(
                      height: 52,
                      child: ElevatedButton(
                          onPressed: () {
                            setState(() {
                              nivel++;
                            });
                          },
                          child: Column(
                            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                            crossAxisAlignment: CrossAxisAlignment.end,
                            children: [
                              Icon(
                                Icons.arrow_drop_up,
                                color: Colors.white,
                              ),
                              Text(
                                'Up!',
                                style: TextStyle(color: Colors.white),
                              )
                            ],
                          )),
                    )
                  ],
                ),
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Padding(
                    padding: const EdgeInsets.all(8.0),
                    child: Container(
                      width: 200,
                      child: LinearProgressIndicator(
                        color: Colors.white,
                        value: nivel / 10,
                      ),
                    ),
                  ),
                  Padding(
                    padding: const EdgeInsets.all(12.0),
                    child: Text(
                      'Nível: $nivel',
                      style: TextStyle(color: Colors.white, fontSize: 18),
                    ),
                  ),
                ],
              )
            ],
          )
        ]),
      ),
    );
  }
}
