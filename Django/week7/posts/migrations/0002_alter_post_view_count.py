# Generated by Django 4.2.13 on 2024-05-18 23:53

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('posts', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='post',
            name='view_count',
            field=models.IntegerField(verbose_name='조회수'),
        ),
    ]
