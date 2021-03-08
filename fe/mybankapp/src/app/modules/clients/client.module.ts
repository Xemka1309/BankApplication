
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClientForm } from './components/ClientForm';
import {FormsModule} from '@angular/forms';
import { AgGridModule } from 'ag-grid-angular';
@NgModule({
  declarations: [ClientForm],
  imports: [CommonModule, FormsModule, AgGridModule ],
  exports: [ClientForm],
  providers: [],
})
export class ClientModule {}
