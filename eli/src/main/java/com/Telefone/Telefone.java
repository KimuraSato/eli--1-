package com.Telefone;

    import java.lang.annotation.ElementType;
    import java.lang.annotation.Retention;
    import java.lang.annotation.RetentionPolicy;
    import java.lang.annotation.Target;
    import jakarta.validation.Constraint;
    import jakarta.validation.Payload;

    @Constraint(validatedBy = TelefoneValidator.class )//Qual a classe 
    @Target({ElementType.FIELD, ElementType.PARAMETER})//Qual lugar irá aceitar a anotação
    @Retention(RetentionPolicy.RUNTIME)//Onde vai ser executado

    public @interface Telefone {

    //Mensagem padrão da validação do telefone
    String message() default "Telefone Inválido"; 
    
    //Permite agrupar validações
    Class<?>[] groups() default {};

    //Permite ter mais informação de erro
    Class<? extends Payload>[] payload() default{};

    //Parametro com o objetivo de definir se pode telefone fixo ou celular 
    boolean apenasCelular() default false;
    
    //Parametro com o objetivo de definir se é obrigatório o preenchimento
    boolean required() default false;

}
