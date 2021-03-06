/**
 * 
 */
package org.nuunframework.kernel.plugin.request;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;


/**
 * @author Epo Jemba
 *
 */
public class ClasspathScanRequestBuilder implements Builder<Collection<ClasspathScanRequest>>
{
    
    private Collection<ClasspathScanRequest> requests;
    
    /**
     * 
     */
    public ClasspathScanRequestBuilder()
    {
        requests = new HashSet<ClasspathScanRequest>();
    }
    
    
    public ClasspathScanRequestBuilder annotationType(Class<? extends Annotation> annotationTypeRequested)
    {
        
        requests.add(new ClasspathScanRequest(RequestType.ANNOTATION_TYPE, annotationTypeRequested));
        
        return this;
    }

    public ClasspathScanRequestBuilder annotationRegex(String annotationRegex)
    {
        
        requests.add(new ClasspathScanRequest(RequestType.ANNOTATION_REGEX_MATCH, annotationRegex));
        
        return this;
    }

    public ClasspathScanRequestBuilder subtypeOf(Class<?> parentTypeRequested)
    {
        
        requests.add(new ClasspathScanRequest(RequestType.SUBTYPE_OF_BY_CLASS, parentTypeRequested));
        
        return this;
    }
    
    public ClasspathScanRequestBuilder subtypeOfRegex(String parentTypeRegex)
    {
        
        requests.add(new ClasspathScanRequest(RequestType.SUBTYPE_OF_BY_REGEX_MATCH, parentTypeRegex));
        
        return this;
    }
    
    public ClasspathScanRequestBuilder typeOfRegex(String typeRegex)
    {
        
        requests.add(new ClasspathScanRequest(RequestType.TYPE_OF_BY_REGEX_MATCH, typeRegex));
        
        return this;
    }

    
    @Override
    public Collection<ClasspathScanRequest> build()
    {
        return Collections.unmodifiableCollection(requests);
    }
    
    @Override
    public void reset()
    {
        requests.clear();
    }
    
    
}
