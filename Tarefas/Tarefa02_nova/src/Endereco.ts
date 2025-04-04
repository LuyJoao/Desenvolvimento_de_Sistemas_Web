export default class Endereco{
    private _rua : string;
    private _numero : number;
    private _cidade : string;
    private _estado : string;

    constructor (rua : string, numero : number, cidade : string, estado : string){
        this._cidade = cidade;
        this._estado = estado;
        this._numero = numero;
        this._rua = rua;
    }

    public get rua() : string{
        return this.rua;
    }

    public get numero() : number{
        return this.numero;
    }

    public get cidade() : string{
        return this.cidade
    }
    
    public get estado() : string{
        return this.estado;
    }

    public set rua (rua : string){
        this._rua = rua;
    }

    public set numero (numero : number){
        this._numero = numero;
    }

    public set cidade (cidade : string){
        this._cidade = cidade;
    }

    public set estado (estado : string){
        this._estado = estado;
    }
}