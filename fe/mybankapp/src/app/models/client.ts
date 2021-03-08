export interface IClient {
  id?: number;
  name: string;
  surname: string;
  firstName: string;
  middleName: string;
  birthDate: Date;
  genre: string;
  passportId: string;
  issuedBy: string;
  issuedWhen: Date;
  identificationNumber: string;
  birthPlace: string;
  residencePlace: string;
  residenceAddress: string;
  homePhone: string;
  mobilePhone: string;
  email: string;
  workPlace: string;
  registrationAddress: string;
  maritalStatus: string;
  citizenship: string;
  disability: string;
  isRetire: boolean;
  monthlyIncome: number;
}
