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
              Task('Dormir',
                  'https://www.drronsanimalhospitalsimivalley.com/wp-content/uploads/2018/11/Dog-Sleeping-Over-Mat.jpg',1),
              Task('Flutter',
                  'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgZZOcHHzuMXdmgLHu8bUKA0Q45OjzhqBSw2oTkt85c_6xjU5fskEIDMh8B5jL6-KSQTo&usqp=CAU',3),
              Task('Java',
                  'https://miro.medium.com/max/625/1*C-zXmTMHObZWyZBUbdruGg.jpeg',4),
              Task('Javascript',
                  'https://thumbs.dreamstime.com/b/smart-working-dog-using-computer-typing-laptop-keyboard-designer-freelancer-remotely-home-pet-clothes-gray-jumper-hoodie-176711684.jpg',2),
              Task('C++',
                  'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2k6bZcHGkeHdrlBkNpxSQ3YxNbIpNdFUXPQ&usqp=CAU',5),
            ],
          ),
        ));
  }
}

class Task extends StatefulWidget {
  final String task;
  final String imageUrl;
  final int difficulty;
  const Task(this.task, this.imageUrl, this.difficulty, {super.key});

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
                      child: Image.network(
                        widget.imageUrl,
                        fit: BoxFit.cover,
                      ),
                    ),
                    Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Container(
                          width: 200,
                          child: Text(
                            widget.task,
                            style: TextStyle(
                                fontSize: 24, overflow: TextOverflow.ellipsis),
                          ),
                        ),
                        Row(
                          children: [
                            Icon(
                              Icons.star,
                              color: widget.difficulty >= 1 ? Colors.blue : Colors.grey,
                            ),
                            Icon(
                              Icons.star,
                              color: widget.difficulty >= 2 ? Colors.blue : Colors.grey,
                            ),
                            Icon(
                              Icons.star,
                              color: widget.difficulty >= 3 ? Colors.blue : Colors.grey,
                            ),
                            Icon(
                              Icons.star,
                              color: widget.difficulty >= 4 ? Colors.blue : Colors.grey,
                            ),
                            Icon(
                              Icons.star,
                              color: widget.difficulty >= 5 ? Colors.blue : Colors.grey,
                            ),
                          ],
                        )
                      ],
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
                        value: widget.difficulty > 0 ? (nivel/widget.difficulty)/10 : 1,
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
