import 'package:flutter/material.dart';
import 'package:easy_localization/easy_localization.dart';

class TranslationButton extends StatefulWidget {
  const TranslationButton({super.key});

  @override
  TranslationButtonState createState() => TranslationButtonState();
}

class TranslationButtonState extends State<TranslationButton> {
  @override
  Widget build(BuildContext context) {
    return PopupMenuButton<Locale>(
      onSelected: (Locale locale) {
        context.setLocale(locale);
      },
      itemBuilder: (BuildContext context) => <PopupMenuEntry<Locale>>[
        const PopupMenuItem<Locale>(
          value: Locale('en', 'US'),
          child: Text('English'),
        ),
        const PopupMenuItem<Locale>(
          value: Locale('ja', 'JP'),
          child: Text('Japanese'),
        ),
        const PopupMenuItem<Locale>(
          value: Locale('ta', 'IN'),
          child: Text('Tamil'),
        ),
      ],
      child: const Text('Change Language'),
    );
  }
}