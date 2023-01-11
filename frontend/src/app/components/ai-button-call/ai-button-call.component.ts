import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-ai-button-call',
  templateUrl: './ai-button-call.component.html',
  styleUrls: ['./ai-button-call.component.scss']
})
export class AiButtonCallComponent {

  @Output() btnClick: EventEmitter<any> = new EventEmitter();

  @Input() nature: string | undefined;
  @Input() typeOf: string | undefined;

  callApiForNewResponse() {
    this.btnClick.emit();
  }

}
