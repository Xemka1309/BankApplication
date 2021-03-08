import { Component, OnInit } from '@angular/core';
import { IClient } from 'src/app/models/client';
@Component({
  selector: 'client-form',
  templateUrl: './client-form.component.html',
  styleUrls: ['./client-form.component.scss']
})
export class ClientForm implements OnInit {


  citienzships = ["huy", "pidor"];
  disabilities = ["invalid", "pidor"]

  clientForm: any = {
    formmode: "add",
    surname: "ваав",
    firstName: "вава",
    middleName: "ава",
    birthDate: "",
    genre: "",
    passportId: "",
    issuedBy: "",
    issuedWhen: "",
    identificationNumber: "",
    birthPlace: "",
    residencePlace: "",
    residenceAddress: "",
    homePhone: "",
    mobilePhone: "",
    email: "",
    registrationAddress: "",
    maritalStatus: "",
    citizenship: "",
    disability: "",
    isRetire: false,
    monthlyIncome: 0
  }

  onFormClick(){
    console.log(this.clientForm);

  }

  formtitle = () => {return  this.clientForm.formmode == "add" ? "Добавить клиента" : "Редактировать клиента"};

  columnDefs = [
    { field: 'имя', sortable: true },
    { field: 'фамилия', sortable: true },
    { field: 'отчество', sortable: true }
  ];

  rowData = [
    { имя: 'Максим', фамилия: 'Макаревич', отчество: "Владимирович" },
    { имя: 'ПИдор', фамилия: 'Пидорович', отчество: "Пидриллович" },
  ];


  constructor() { }

  ngOnInit(): void { }
}
