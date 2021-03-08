import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClientForm } from './modules/clients/components/ClientForm';


const routes: Routes = [{component: ClientForm, path: "clients", pathMatch: "full"} ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
