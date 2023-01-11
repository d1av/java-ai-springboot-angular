import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-ai-button-call',
  templateUrl: './ai-button-call.component.html',
  styleUrls: ['./ai-button-call.component.scss']
})
export class AiButtonCallComponent {

  @Output() btnClick: EventEmitter<any> = new EventEmitter();

  callApiForNewResponse() {
    this.btnClick.emit();
  }

}
